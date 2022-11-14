<template>
  <div class="dashboard-container">
    <div class="dashboard-text">
      博客管理系统 持续优化更新中
    </div>
    <div>
      GitHub账号：<a href="https://github.com/YuTao0310">https://github.com/YuTao0310</a> YuTao0310
    </div>
  </div>
</template>

<script>
import { mapGetters } from 'vuex'
export default {
  name: 'Dashboard',
  computed: {
    ...mapGetters([
      'name'
    ])
  }
}
</script>

<style lang="scss" scoped>
.dashboard {
  &-container {
    margin: 30px;
  }
  &-text {
    font-size: 30px;
    line-height: 46px;
  }
}
</style>
