import React, {Component} from 'react';
import { auth } from '../services/firebase';
import { db } from '../services/firebase';

export default class Chat extends Component {
    constructor(props) {
        super(props);
        this.state = {
            user: auth().currentUser,
            chats: [],
            content: '',
            readError: null,
            writeError: null,
        };
    }

    async componentDidMount() {
        this.setState({ readError: null });
        try {
            db.ref("chats").on("value", snapshot => {
                let chats = [];
                snapshot.forEach((snap) => {
                    chats.push(snap.val());
                });
                this.setState({ chats });
            });
        } catch (error) {
            this.setState({ readError: error.message });
        }
    }

    render() {
        return (
            <div>
                <div clasName="chats">
                    {this.state.chats.map(chat => {
                        return <p key={chat.timestamp}>{chat.content}</p>
                    })}
                </div>
                <div>
                    Logged in as: <strong>{this.state.user.email}</strong>
                </div>
            </div>
        );
    }

}