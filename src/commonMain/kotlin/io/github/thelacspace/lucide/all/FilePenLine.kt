package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FilePenLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.36400032043457,13.633999824523926)
                curveTo(14.12624740600586,13.871622085571289,13.952220916748047,14.165334701538086,13.858000755310059,14.48799991607666)
                lineTo(13.021000862121582,17.357999801635742)
                curveTo(12.969882011413574,17.53326416015625,13.018352508544922,17.722457885742188,13.147446632385254,17.851552963256836)
                curveTo(13.276541709899902,17.980648040771484,13.46573543548584,18.02911949157715,13.641000747680664,17.97800064086914)
                lineTo(16.511001586914062,17.141000747680664)
                curveTo(16.833667755126953,17.04677963256836,17.12738037109375,16.872753143310547,17.365001678466797,16.635000228881836)
                lineTo(21.378002166748047,12.62600040435791)
                curveTo(22.201213836669922,11.795392990112305,22.198217391967773,10.455620765686035,21.371299743652344,9.628703117370605)
                curveTo(20.544382095336914,8.80178451538086,19.20461082458496,8.798789024353027,18.37400245666504,9.622000694274902)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.487000465393066,7.857999801635742)
                curveTo(14.185065269470215,7.677554130554199,14.000137329101562,7.351746082305908,14.0,7.0)
                lineTo(14.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,19.645000457763672)
                lineTo(20.0,20.0)
                curveTo(20.0,21.104570388793945,19.104570388793945,22.0,18.0,22.0)
                lineTo(6.0,22.0)
                curveTo(4.895430564880371,22.0,4.0,21.104570388793945,4.0,20.0)
                lineTo(4.0,4.0)
                curveTo(4.0,2.895430564880371,4.895430564880371,2.0,6.0,2.0)
                lineTo(14.0,2.0)
                curveTo(14.639365196228027,1.9989635944366455,15.252715110778809,2.2530863285064697,15.704000473022461,2.7059998512268066)
                lineTo(18.220001220703125,5.2220001220703125)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,18.0)
                lineTo(9.0,18.0)
            }
}

public val LucideIcons.All.FilePenLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FilePenLine: ImageVector
    @Composable get() = FilePenLineDefinition.asImageVector()
