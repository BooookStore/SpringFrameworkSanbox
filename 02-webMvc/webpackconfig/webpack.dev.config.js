const path = require('path');
const merge = require('webpack-merge');

const baseConfig = require('./webpack.base.config');
const common = require('./common');

module.exports = merge(baseConfig, {
    devServer: {
        contentBase: common.outputDirectory
    },
});
