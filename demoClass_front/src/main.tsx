import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import { createBrowserRouter, RouterProvider } from 'react-router-dom';
import StudentsPage from './studentsPage.tsx'
import ClassesPage from './classesPage.tsx'

const router = createBrowserRouter([
  {
    path: '/', // 建議加入根路徑直接對應到學生名單，或設定重新導向
    element: <StudentsPage />
  },
  {
    path: '/studentPage',
    element: <StudentsPage />
  },
  {
    path: '/classesPage',
    element: <ClassesPage />
  },
  
]);

createRoot(document.getElementById('root')!).render(
  <StrictMode>
    <RouterProvider router={router} />
  </StrictMode>,
);
