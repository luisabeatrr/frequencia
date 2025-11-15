import { Outlet } from "react-router-dom";
import Footer from "../footer";
import Header from "../header";
import Sidebar from "../sidebar";

function LayoutLogin() {
  const backgroundImage = `url("https://recreio.com.br/wp-content/uploads/animacoes/burro_dragao_e_filhotes.jpg")`;

  return (
    <div className="d-flex justify-content-center align-items-center vh-100 bg-light">
      <div style={{ width: "400px" }}>
        <Outlet />
      </div>
    </div>
  );
}

export default LayoutLogin;
