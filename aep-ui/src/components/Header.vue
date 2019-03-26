<template>
    <div id="id-mast-head">
        <nav class="navbar navbar-expand-lg">
            <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <router-link to="/" class="nav-link">Home</router-link> 
                </li>

                <li class="nav-item">
                    <router-link to="/about" class="nav-link">API Hackathon</router-link>
                </li>
            </ul>
            </div>  
        </nav>
        
    </div>
</template>

<script>
export default {
    name: "Header"

}
</script>

<style scoped>



</style>


