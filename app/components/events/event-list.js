import React from 'react';
import EventItem from "./event-item.js";
import classes from './event-list.module.css'

const EventList = (props) => {
    const {items} = props;
    return (
        <ul className={classes.list}>
            {items.map(event => <li key={event.id}><EventItem
                                               title={event.title}
                                               image={event.image}
                                               date={event.date}
                                               location={event.location}
                                               id={event.id}

            /></li>)}
        </ul>
    );
};

export default EventList;
