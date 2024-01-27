import { useEffect, useState } from 'react';
import './App.css';
import {getCtos} from './springboot/CTOservice';

function App() {
  const[data, setData] = useState({});
  const[currentPage, setCurrentPage] = useState(0);

  const getCtos = async(page = 0) => {
    try{
      setCurrentPage(page);
      const { data} = await getCtos();
      setData(data);
      console.log(data);
    }catch(error){
      console.log(error);
    }
  }

  useEffect(() => {
    getCtos();
  },[])

  return (
    <div>
        <h1>Hello</h1>
    </div>
  );
}

export default App;
