<template>
    <div id="id-mast-head">
        <nav class="navbar">
            <ul class="nav">
                <li>
                    <router-link to="/">Home</router-link> 
                </li>

                <li>
                    <router-link to="/about">API Hackathon</router-link>
                </li>
            </ul>

        </nav>
    </div>
</template>

<script>
export default {
    name: "Header"

}
</script>

<style scoped lang="scss" >

    .nav {
        background-color: grey;
    }
    ul > li:not(:last-child) {
        padding-right: 10px;
    }
</style>


