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

           <li class="nav-item">
            <div class="dropdown">
            <button
              class="btn  dropdown-toggle"
              type="button"
              id="dropdownMenuButton"
              data-toggle="dropdown"
              aria-haspopup="true"
              aria-expanded="false"
            >Account</button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                <router-link to="/login" class="dropdown-item">Sign in</router-link>
                <router-link to="/register" class="dropdown-item">Register</router-link>
            </div>
          </div>
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


