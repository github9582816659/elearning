import React from 'react';
import classes from './event-item.module.css'
import Button from "../ui/button.js";
import DateIcon from "../icons/date-icon.js";
import AddressIcon from "../icons/address-icon.js";
import ArrowRightIcon from "../icons/arrow-right-icon.js";

const EventItem = (props) => {
    const {title, image, date, location, id} = props;

    const formattedDate = new Date(date).toLocaleDateString('en-US', {
        day: "numeric",
        month: "long",
        year: "numeric",
    })

    const formattedLocation = location.replace(', ', '\n');
    const formattedLink = `/events/${id}`;

    return (
        <li className={classes.item}>

            <img src={'/' + image} alt={title}/>

            <div className={classes.content}>
                <div>
                    <h2>{title}</h2>
                    <div className={classes.date}>
                        <DateIcon/>
                        <time>{formattedDate}</time>
                    </div>
                    <div className={classes.address}>
                        <AddressIcon/>
                        <address>{formattedLocation}</address>
                    </div>
                </div>

                <div className={classes.actions}>
                    <Button link={formattedLink}>
                        <span>Explore Event</span>
                        <span className={classes.icon}><ArrowRightIcon/></span>
                    </Button>
                </div>
            </div>
        </li>
    );
};

export default EventItem;
