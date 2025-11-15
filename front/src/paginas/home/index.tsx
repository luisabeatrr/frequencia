import React from "react";

export default function Home() {
  return (
    <div className="container my-4">
      {/* Header / Navbar */}
      <nav className="navbar navbar-expand-lg navbar-light bg-light rounded mb-4">
        <div className="container-fluid">
          <a className="navbar-brand" href="#">Controle de Frequência</a>
          <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navMenu" aria-controls="navMenu" aria-expanded="false" aria-label="Toggle navigation">
            <span className="navbar-toggler-icon" />
          </button>

          <div className="collapse navbar-collapse" id="navMenu">
            <ul className="navbar-nav me-auto mb-2 mb-lg-0">
              <li className="nav-item">
                <a className="nav-link active" aria-current="page" href="#">Início</a>
              </li>
              <li className="nav-item">
                <a className="nav-link" href="#">Alunos</a>
              </li>
            </ul>

            <form className="d-flex" role="search">
              <input className="form-control me-2" type="search" placeholder="Buscar aluno" aria-label="Search" />
              <button className="btn btn-outline-primary" type="submit">Buscar</button>
            </form>

            <button className="btn btn-danger ms-3">Sair</button>
          </div>
        </div>
      </nav>

      {/* Main layout: left = form, right = list */}
      <div className="row g-4">
        {/* Left column: form to add registro */}
        <div className="col-12 col-lg-4">
          <div className="card shadow-sm">
            <div className="card-body">
              <h5 className="card-title">Novo Registro</h5>

              <form>
                <div className="mb-3">
                  <label className="form-label">Nome do Aluno</label>
                  <input type="text" className="form-control" placeholder="Ex: João Silva" />
                </div>

                <div className="mb-3">
                  <label className="form-label">Data</label>
                  <input type="date" className="form-control" />
                </div>

                <div className="mb-3">
                  <label className="form-label">Status</label>
                  <select className="form-select">
                    <option value="PRESENTE">PRESENTE</option>
                    <option value="AUSENTE">AUSENTE</option>
                  </select>
                </div>

                <div className="d-grid">
                  <button type="button" className="btn btn-primary">Registrar presença</button>
                </div>
              </form>
            </div>
          </div>

          {/* Small summary card */}
          <div className="card mt-3 shadow-sm">
            <div className="card-body">
              <h6 className="card-subtitle mb-2 text-muted">Resumo rápido</h6>
              <div className="d-flex justify-content-between align-items-center">
                <div>
                  <div className="h5 mb-0">120</div>
                  <small className="text-muted">Registros totais</small>
                </div>
                <div className="text-end">
                  <div className="h5 mb-0 text-success">85%</div>
                  <small className="text-muted">Média presença</small>
                </div>
              </div>
            </div>
          </div>
        </div>

        {/* Right column: registros list */}
        <div className="col-12 col-lg-8">
          <div className="card shadow-sm">
            <div className="card-body">
              <div className="d-flex justify-content-between align-items-center mb-3">
                <h5 className="card-title mb-0">Registros de Frequência</h5>
                <div>
                  <button className="btn btn-outline-secondary btn-sm me-2">Exportar CSV</button>
                  <button className="btn btn-outline-secondary btn-sm">Filtrar</button>
                </div>
              </div>

              <div className="table-responsive">
                <table className="table table-hover align-middle">
                  <thead className="table-light">
                    <tr>
                      <th>Aluno</th>
                      <th>Data</th>
                      <th>Status</th>
                      <th className="text-end">Ações</th>
                    </tr>
                  </thead>
                  <tbody>
                    {/* Example static rows */}
                    <tr>
                      <td>João Silva</td>
                      <td>2025-11-14</td>
                      <td><span className="badge bg-success">PRESENTE</span></td>
                      <td className="text-end">
                        <button className="btn btn-sm btn-outline-primary me-2">Editar</button>
                        <button className="btn btn-sm btn-outline-danger">Remover</button>
                      </td>
                    </tr>

                    <tr>
                      <td>Maria Oliveira</td>
                      <td>2025-11-14</td>
                      <td><span className="badge bg-danger">AUSENTE</span></td>
                      <td className="text-end">
                        <button className="btn btn-sm btn-outline-primary me-2">Editar</button>
                        <button className="btn btn-sm btn-outline-danger">Remover</button>
                      </td>
                    </tr>

                    <tr>
                      <td>Carlos Pereira</td>
                      <td>2025-11-14</td>
                      <td><span className="badge bg-success">PRESENTE</span></td>
                      <td className="text-end">
                        <button className="btn btn-sm btn-outline-primary me-2">Editar</button>
                        <button className="btn btn-sm btn-outline-danger">Remover</button>
                      </td>
                    </tr>
                  </tbody>
                </table>
              </div>

              <div className="d-flex justify-content-between align-items-center mt-3">
                <small className="text-muted">Mostrando 1-3 de 120 registros</small>
                <nav>
                  <ul className="pagination pagination-sm mb-0">
                    <li className="page-item disabled"><a className="page-link" href="#">Anterior</a></li>
                    <li className="page-item active"><a className="page-link" href="#">1</a></li>
                    <li className="page-item"><a className="page-link" href="#">2</a></li>
                    <li className="page-item"><a className="page-link" href="#">Próximo</a></li>
                  </ul>
                </nav>
              </div>
            </div>
          </div>

          {/* Percentage card example */}
          <div className="card mt-3 shadow-sm">
            <div className="card-body d-flex justify-content-between align-items-center">
              <div>
                <h6 className="mb-0">Porcentagem por aluno</h6>
                <small className="text-muted">Clique em um aluno para ver detalhes</small>
              </div>
              <div className="text-center">
                <div className="h4 mb-0">João Silva</div>
                <div className="display-6 text-success">92%</div>
              </div>
            </div>
          </div>
        </div>
      </div>

      {/* Footer */}
      <footer className="mt-4 text-center text-muted small">
        © {new Date().getFullYear()} Controle de Frequência • Desenvolvido por você
      </footer>
    </div>
  );
}
