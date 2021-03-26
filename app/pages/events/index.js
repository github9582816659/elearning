import React, {Fragment} from 'react';
import {getAllEvents} from "../../dummy-data.js";
import EventList from "../../components/events/event-list.js";
import EventSearch from "../../components/events/event-search.js";
import {useRouter} from "next/router.js";

const Index = () => {
    const allEvents = getAllEvents();
    const router = useRouter();

    const onSearch = (year,month) => {
        const path = `/events/${year}/${month}`;
        router.push(path);
    }

    return (
        <Fragment>
            <EventSearch onSearch={onSearch}/>
            <EventList items={allEvents} />
        </Fragment>
    );
};

export default Index;
