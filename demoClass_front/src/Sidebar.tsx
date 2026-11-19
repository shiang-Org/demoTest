import { Accordion, Nav, Spinner } from 'react-bootstrap';
import { useNavigate, Link } from 'react-router-dom';
import { 
  BsPeople, 
  BsGlobe,
  BsArrowRightShort
} from 'react-icons/bs';

import './Sidebar.css'; // 引入 Sidebar 的 CSS 樣式

function Sidebar() {

  return (
    <div className="sidebar-container bg-white border-end vh-100 p-3" style={{ width: '260px' }}>
      {/* 1. 頂部 Logo 與標題 */}
      <div className="d-flex align-items-center justify-content-between mb-4 pb-2 border-bottom">
        <div className="d-flex align-items-center gap-2">
          <BsGlobe className="text-primary fs-3" />
          <span className="fw-bold fs-5 text-dark">demoTest V1.0.1</span>
        </div>
      </div>

      {/* 2. 可折疊式主選單（權限動態過濾） */}
      
        <Accordion defaultActiveKey="0" flush className="sidebar-accordion">
          
          {/* 【使用者資料】權限：USER_ADMIN 或 ACCESS_ADMIN */}
          <Accordion.Item eventKey="1" className="border-0 mb-2">
            <Accordion.Header>
              <BsPeople className="me-2 fs-5" /> 班級資料 V1.0.1
            </Accordion.Header>
            <Accordion.Body className="p-0 mt-2">
              <div className="border rounded p-2 bg-white sub-menu-box">
                <Nav className="flex-column">

                    <Nav.Link as={Link} to="/classesPage" className="sub-link">
                      <BsArrowRightShort /> 班級清單
                    </Nav.Link>
                  
                </Nav>
              </div>
            </Accordion.Body>
          </Accordion.Item>
          
          <Accordion.Item eventKey="1" className="border-0 mb-2">
            <Accordion.Header>
              <BsPeople className="me-2 fs-5" /> 學生資料 V1.0.1
            </Accordion.Header>
            <Accordion.Body className="p-0 mt-2">
              <div className="border rounded p-2 bg-white sub-menu-box">
                <Nav className="flex-column">

                    <Nav.Link as={Link} to="/studentPage" className="sub-link">
                      <BsArrowRightShort /> 學生清單
                    </Nav.Link>
                  
                </Nav>
              </div>
            </Accordion.Body>
          </Accordion.Item>

        </Accordion>
      
    </div>
  );
}

export default Sidebar;