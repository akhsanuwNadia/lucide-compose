package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShrimpOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,2.0)
                curveTo(10.603822708129883,3.2056756019592285,11.88400936126709,3.9189627170562744,13.22700023651123,3.797999858856201)
                lineTo(19.39699935913086,3.236999988555908)
                curveTo(20.25019073486328,3.1943044662475586,21.061012268066406,3.6113789081573486,21.522441864013672,4.330295562744141)
                curveTo(21.983871459960938,5.0492119789123535,22.02536964416504,5.960069179534912,21.631223678588867,6.717965602874756)
                curveTo(21.237077713012695,7.4758620262146,20.467538833618164,7.964937210083008,19.61400032043457,8.0)
                lineTo(13.5,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,20.0)
                curveTo(10.5,20.5,9.880000114440918,21.0,8.5,21.0)
                curveTo(7.123652458190918,20.993844985961914,6.011155605316162,19.876361846923828,6.011155605316162,18.5)
                curveTo(6.011155605316162,17.123638153076172,7.123652458190918,16.006155014038086,8.5,16.0)
                lineTo(12.0,16.0)
                curveTo(13.144672393798828,16.00018882751465,14.271926879882812,15.7196626663208,15.282999992370605,15.182999610900879)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,22.0)
                curveTo(10.5,21.5,9.880000114440918,21.0,8.5,21.0)
                curveTo(6.177475452423096,21.00029754638672,4.031262397766113,19.76136589050293,2.869999885559082,17.75)
                curveTo(1.7040953636169434,15.804503440856934,1.6475549936294556,13.389135360717773,2.7211499214172363,11.391215324401855)
                curveTo(3.7947447299957275,9.393295288085938,5.8401665687561035,8.107429504394531,8.105999946594238,8.005999565124512)
            }
            lucidePath(strokeWidth) {
                moveTo(18.040000915527344,12.539999961853027)
                curveTo(18.668956756591797,11.466301918029785,19.00033187866211,10.244352340698242,19.0,9.0)
                lineTo(19.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,16.0)
                curveTo(6.0,16.0,3.5,12.0,4.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.430000305175781,9.329999923706055)
                curveTo(8.69963264465332,11.537701606750488,8.905630111694336,13.948235511779785,10.0,16.0)
            }
}

public val LucideIcons.All.ShrimpOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShrimpOff: ImageVector
    @Composable get() = ShrimpOffDefinition.asImageVector()
