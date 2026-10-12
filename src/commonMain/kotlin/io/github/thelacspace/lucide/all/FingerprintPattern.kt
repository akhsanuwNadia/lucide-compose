package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FingerprintPattern") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,10.0)
                curveTo(10.895430564880371,10.0,10.0,10.895430564880371,10.0,12.0)
                curveTo(10.0,13.020000457763672,9.899999618530273,14.510000228881836,9.739999771118164,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,13.119999885559082)
                curveTo(14.0,15.5,14.0,19.5,13.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.290000915527344,21.020000457763672)
                curveTo(17.410001754760742,20.420000076293945,17.720001220703125,18.720001220703125,17.790000915527344,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                curveTo(2.0,7.695695877075195,4.754301071166992,3.87430739402771,8.837722778320312,2.513166904449463)
                curveTo(12.921143531799316,1.1520265340805054,17.417417526245117,2.5565567016601562,20.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,16.0)
                lineTo(2.009999990463257,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.799999237060547,16.0)
                curveTo(22.0,14.0,21.930999755859375,10.645999908447266,21.799999237060547,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,19.5)
                curveTo(5.5,18.0,6.0,15.0,6.0,12.0)
                curveTo(5.998989582061768,11.318867683410645,6.11396598815918,10.642535209655762,6.340000152587891,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.649999618530273,22.0)
                curveTo(8.859999656677246,21.34000015258789,9.09999942779541,20.68000030517578,9.219999313354492,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,6.800000190734863)
                curveTo(10.857001304626465,5.727859020233154,13.145008087158203,5.7282257080078125,15.001667022705078,6.800961494445801)
                curveTo(16.85832405090332,7.873697280883789,18.001375198364258,9.855719566345215,18.0,12.0)
                lineTo(18.0,14.0)
            }
}

public val LucideIcons.All.FingerprintPatternDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FingerprintPattern: ImageVector
    @Composable get() = FingerprintPatternDefinition.asImageVector()
