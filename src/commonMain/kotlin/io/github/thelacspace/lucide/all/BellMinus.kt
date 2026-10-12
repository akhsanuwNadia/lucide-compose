package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BellMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.267999649047852,21.0)
                curveTo(10.62527847290039,21.618751525878906,11.285504341125488,21.99991226196289,12.0,21.99991226196289)
                curveTo(12.714494705200195,21.99991226196289,13.374720573425293,21.618751525878906,13.731999397277832,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,8.0)
                lineTo(21.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.243000030517578,3.756999969482422)
                curveTo(14.526999473571777,2.0407087802886963,11.946038246154785,1.5272334814071655,9.703802108764648,2.4560444355010986)
                curveTo(7.461565971374512,3.384855031967163,5.999709129333496,5.57300329208374,6.0,8.0)
                curveTo(6.0,12.499000549316406,4.5889997482299805,13.955999374389648,3.26200008392334,15.326000213623047)
                curveTo(2.995089054107666,15.618545532226562,2.925956964492798,16.041038513183594,3.0857067108154297,16.403398513793945)
                curveTo(3.2454564571380615,16.765756607055664,3.603989601135254,16.999710083007812,4.0,17.0)
                lineTo(20.0,17.0)
                curveTo(20.39596176147461,17.000141143798828,20.754716873168945,16.76663589477539,20.914888381958008,16.40451431274414)
                curveTo(21.075061798095703,16.042394638061523,21.00648307800293,15.61987018585205,20.739999771118164,15.32699966430664)
                curveTo(19.822872161865234,14.376004219055176,19.116514205932617,13.242358207702637,18.66699981689453,12.0)
            }
}

public val LucideIcons.All.BellMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BellMinus: ImageVector
    @Composable get() = BellMinusDefinition.asImageVector()
