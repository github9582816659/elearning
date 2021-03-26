import React from 'react';
import {useRouter} from "next/router.js";
import EventList from "../../components/events/event-list.js";

const FilteredEvent = (props) => {
    const router = useRouter();
    const filteredEvents = router.query.slug;

    if (!filteredEvents) {
        return <p className='center'>Loading...</p>
    }

    const year = filteredEvents[0];
    const month = filteredEvents[1];

    const numYear = +year;
    const numMonth = +month;

    return (
        <div>

        </div>
    );

};

export default FilteredEvent;
