/**
 * @fileoverview インデックスページのエントリポイント
 */

import Vue from 'vue';

import pageIndex from 'VueComponent/page/PageIndex.vue';

console.log(pageIndex);

const app = new Vue(pageIndex).$mount('#app');
