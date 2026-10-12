package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Key") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,21.0)
                lineTo(11.600000381469727,11.399999618530273)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5,15.5)
                lineTo(9.800000190734863,17.799999237060547)
                curveTo(10.181142807006836,18.1888427734375,10.181142807006836,18.811155319213867,9.800000190734863,19.19999885559082)
                lineTo(7.700000286102295,21.299999237060547)
                curveTo(7.311156749725342,21.681142807006836,6.688843727111816,21.681142807006836,6.300000190734863,21.299999237060547)
                lineTo(4.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,7.5)
                curveTo(9.991186141967773,9.470820426940918,11.037548065185547,11.295716285705566,12.742875099182129,12.283679008483887)
                curveTo(14.448202133178711,13.271642684936523,16.55179786682129,13.271642684936523,18.257125854492188,12.283679008483887)
                curveTo(19.962451934814453,11.295716285705566,21.008813858032227,9.470820426940918,21.0,7.5)
                curveTo(21.008813858032227,5.529179573059082,19.962451934814453,3.7042839527130127,18.257125854492188,2.716320514678955)
                curveTo(16.55179786682129,1.7283574342727661,14.448202133178711,1.7283574342727661,12.742875099182129,2.716320514678955)
                curveTo(11.037548065185547,3.7042839527130127,9.991186141967773,5.529179573059082,10.0,7.5)
            }
}

public val LucideIcons.All.KeyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Key: ImageVector
    @Composable get() = KeyDefinition.asImageVector()
