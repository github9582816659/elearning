import React, {Fragment} from 'react';
import {useRouter} from "next/router.js";
import {getFilteredEvents} from "../../dummy-data.js";
import EventList from "../../components/events/event-list.js";
import ResultsTitle from "../../components/events/results-title.js";
import ErrorAlert from "../../components/ui/error-alert.js";
import Button from "../../components/ui/button.js";

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

    if (isNaN(numYear) || isNaN(numMonth) || numYear > 2030 || numYear < 2021 || numMonth < 0 || numMonth > 12) {
        return (
            <Fragment>
                <ErrorAlert>
                    <p>Invalid Filtered!</p>
                </ErrorAlert>
                <div className='center'>
                    <Button link="/events">Show all Events</Button>
                </div>
            </Fragment>
        )
    }

    let filterEvents = getFilteredEvents({year: numYear, month: numMonth});
    if (!filterEvents || filterEvents.length === 0) {
        return (
            <Fragment>
                <ErrorAlert>
                    <p>No Events Found</p>
                </ErrorAlert>
                <div className='center'>
                    <Button link="/events">Show all Events</Button>
                </div>
            </Fragment>
        )
    }

    const date = new Date(numYear, numMonth - 1);

    return (
        <Fragment>
            <ResultsTitle date={date}/>
            <EventList items={filterEvents}/>
        </Fragment>
    );

};

export default FilteredEvent;
