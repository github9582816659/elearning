import {getFeaturedEvents} from "../dummy-data.js";
import EventList from "../components/events/event-list.js";

const Home = () => {

    const featuredEvents = getFeaturedEvents();

  return (
    <div>
        <EventList items={featuredEvents} />
    </div>
  )
}

export default Home;
