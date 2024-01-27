import axios from "axios";

const SPRING_URL = "http://127.0.0.3:8080/ctos";

export async function createCto(cto){
    return await axios.post(SPRING_URL, cto);
}

// He doesn't have an example where he doesn't need to send any parameters, so I am unsure if this one is right
export async function getCtos(){
    return await axios.get(`${SPRING_URL}/getCtos`);
}

export async function getCto(uuid){
    return await axios.post(`${SPRING_URL}/${uuid}`);
}

//He didn't show this function within Springboot, so I think you don't need to do it in springboot, cuz this is basically just SQL, but im not sure yet
export async function deleteCto(uuid){
    return await axios.delete(`${SPRING_URL}/${uuid}`);
}