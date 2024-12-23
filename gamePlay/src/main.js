import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import mixins from './mixins'
import store from './store'

createApp(App).mixin(mixins).use(store).use(router).mount('#app')
