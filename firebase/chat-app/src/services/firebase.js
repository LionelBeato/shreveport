import firebase from 'firebase'; 


const config = {
    apiKey: "AIzaSyBR5Z9pgvHjrerBFAexVCMiz10X-RS7F08",
    authDomain: "chat-app-c0ead.firebaseapp.com",
    databaseURL: "https://chat-app-c0ead-default-rtdb.firebaseio.com/"
};

firebase.initializeApp(config);
export const auth = firebase.auth;
export const db = firebase.database(); 