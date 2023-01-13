package com.example.spaceX.feature_spase.domain.query.parent

import com.example.spaceX.feature_spase.domain.query.childe.options.Options
import com.example.spaceX.feature_spase.domain.query.childe.query.Query

class QueryAndOptions(
    val query: Query,
    val options: Options,
)