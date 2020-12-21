module.exports = {
    entry: {
        myApp: "./app/javascript/index.js",
    },
    output: {
        filename: 'bundle.js',
        path: __dirname + '/dist',
    },
    watch: true,
    module: {
        rules: [
            {
                test: /\.css$/,
                use: [
                    { loader: 'style-loader' },
                    { loader: 'css-loader'}
                ]
            }
        ]
    }
}