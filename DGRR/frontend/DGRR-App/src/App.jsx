import React from 'react'
import LoginForm from './containers/user/LoginForm'
import RegisterForm from './containers/user/RegisterForm'
import { Routes, Route } from 'react-router-dom'
<<<<<<< HEAD
import Login from './components/user/Login'
import KioskSelect from './components/kiosk/KioskSelect'
import KioskLogin from './components/kiosk/offline/KioskLogin'
import KioskOfflineGame from './components/kiosk/offline/KioskOfflineGame'
import KioskOfflineResult from './components/kiosk/offline/KioskOfflineResult'
import ScoreTable from './components/kiosk/offline/ScoreTable'
=======
import MainPage from './pages/Mainpage'
import Rankingpage from './pages/Rankingpage'
>>>>>>> 67b4afc110318d75f89474409c034aa496564300

const App = () => {
  return (
    <Routes>
<<<<<<< HEAD
      <Route path="/" element={<Login />} />
      <Route path="/KioskSelect" element={<KioskSelect />} />
      <Route path="/KioskLogin" element={<KioskLogin />} />
      <Route path="/KioskOfflineGame" element={<KioskOfflineGame />} />
      <Route path="/ScoreTable" element={<ScoreTable />} />
      <Route path="/KioskOfflineResult" element={<KioskOfflineResult />} />
=======
      <Route path="/" element={<LoginForm />} />
      <Route path="/register" element={<RegisterForm />} />
      <Route path="/main" element={<MainPage />} />
      <Route path=":nickName" element={<MainPage />} />
      <Route path="ranking" element={<Rankingpage />} />
>>>>>>> 67b4afc110318d75f89474409c034aa496564300
    </Routes>
  )
}

export default App
