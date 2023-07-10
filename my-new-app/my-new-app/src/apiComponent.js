import React, { useEffect, useState } from 'react';
import axios from 'axios';

const ApiComponent = () => {
  const [ids, setIds] = useState([]);

  useEffect(() => {
    fetchIds();
  }, []);

  const fetchIds = async () => {
    try {
      const response = await axios.get('http://localhost:8080/OCB/getOneClickBuy'); 
      setIds(response.data);
    } catch (error) {
      console.error('Error fetching IDs:', error);
    }
  };

  return (
    <div>
      <h1>IDs</h1>
      <ul>
        {ids.map((id) => (
          <li key={id}>{id}</li>
        ))}
      </ul>
    </div>
  );
};

export default ApiComponent;
