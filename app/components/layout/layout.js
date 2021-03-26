import React, {Fragment} from 'react';
import MainHeader from "./main-header.js";

const Layout = (props) => {
    return (
        <Fragment>
            <MainHeader/>
            <main>{props.children}</main>
        </Fragment>
    );
};

export default Layout;
