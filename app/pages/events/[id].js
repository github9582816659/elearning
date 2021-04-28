import React, {Fragment} from 'react';
import {useRouter} from "next/router.js";
import {getEventById} from "../../dummy-data.js";
import EventSummary from "../../components/event-detail/event-summary.js";
import EventLogistics from "../../components/event-detail/event-logistics.js";
import EventContent from "../../components/event-detail/event-content.js";
import ErrorAlert from "../../components/ui/error-alert.js";

const Event = () => {
    const router = useRouter();
    const event = getEventById(router.query.id);

    if(!event) {
        return <ErrorAlert><p>No event found!</p></ErrorAlert>
    }

    return (
        <Fragment>
            <EventSummary title={event.title}/>
            <EventLogistics date={event.date} address={event.location} image={event.image} imageAlt={event.title}/>
            <EventContent>
                <p>{event.description}</p>
            </EventContent>
        </Fragment>
    );
};

export default Event;
