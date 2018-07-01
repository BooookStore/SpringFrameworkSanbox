const path = require('path');

const base = path.resolve(__dirname, '../');

module.exports = {
    outputDirectory: base + '/src/main/webapp/WEB-INF/pages/',
    vueComponentBase: base + '/client/src',
}