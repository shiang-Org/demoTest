import { useEffect, useState } from 'react';
import { Row, Col, Card, Table, Badge, Button, Modal, Form } from 'react-bootstrap';
import { BsPencilSquare, BsTrash, BsPlusLg } from 'react-icons/bs'; // 引入所需的 Icon
import { useNavigate, Link } from 'react-router-dom';

import api from './hooks/axiosInstance'; // 封裝好的axios實例
import Sidebar from './Sidebar'; // 側邊欄元件

// 定義後端回傳資料結構（對應 Java DTO 的 id, number, name）
interface ClassesData{
    id: number;
    grade: string;
    className: string;
}

function ClassesPage(){
    const [ClassesData, setClassesData] = useState<ClassesData[]>([]);
    const [loading, setLoading] = useState<boolean>(true);

    // 1. 取得學生列表資料函式
    const fetchClasses = () => {
        setLoading(true);
        api.get<ClassesData[]>(`/api/classesV1.0.1`)
            .then(res => {
                setClassesData(res.data);
                setLoading(false);
            })
            .catch(err => {
                console.error('取得資料失敗：', err);
                setLoading(false);
            });
    };

    useEffect(() => {
        fetchClasses();
    }, []);

    return (
        <div className="d-flex min-vh-100 bg-light">
            <Sidebar />
            <div className="flex-grow-1 p-4">
                <div className="mb-4">
                    <h2 className="fw-bold text-dark">班級清單</h2>
                    <p className="text-muted m-0">檢視班級清單詳細資訊。</p>
                </div>

                <Row className="g-4">
                    <Col lg={12}>
                        <Card className="shadow-sm border-0">
                            <Card.Header className="bg-white border-bottom py-3 d-flex align-items-center justify-content-between">
                                <h5 className="fw-bold m-0 text-primary">班級清單資訊</h5>
                            </Card.Header>

                            <Card.Body className="p-0">
                                <Table responsive hover className="mb-0 align-middle">
                                    <thead className="table-light">
                                        <tr>
                                            <th className="px-4 py-3" style={{ width: '15%' }}>年級</th>
                                            <th className="px-4 py-3" style={{ width: '20%' }}>班級</th>
                                            <th className="px-4 py-3 text-center" style={{ width: '15%' }}>操作</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        {ClassesData.length > 0 ? (
                                            ClassesData.map((item) => (
                                                // 使用正確的 item.id 作為 key
                                                <tr key={item.id}>
                                                    <td className="px-4 py-3">{item.grade}</td>
                                                    <td className="px-4 py-3">{item.className}</td>
                                                    <td className="px-4 py-3 text-center">
                                                    </td>
                                                </tr>
                                            ))
                                        ) : (
                                            <tr>
                                                {/* 總共有 3 個欄位，colSpan 應為 3 */}
                                                <td colSpan={3} className="text-center py-4 text-muted">
                                                    {loading ? '載入中...' : '目前尚無資料'}
                                                </td>
                                            </tr>
                                        )}
                                    </tbody>
                                </Table>
                            </Card.Body>
                        </Card>
                    </Col>
                </Row>
            </div>
        </div>
    );
}

export default ClassesPage;