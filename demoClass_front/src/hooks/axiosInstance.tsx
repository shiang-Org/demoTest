import axios from 'axios';

const api = axios.create({
  // Vite 會根據你執行的指令自動切換對應的 .env 檔案
  baseURL: import.meta.env.VITE_API_BASE_URL || '', // 後端 API 的基本 URL
  headers: {
    'Content-Type': 'application/json',
  },
});

export default api;