package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BeefOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.770999908447266,6.109000205993652)
                curveTo(12.654423713684082,5.839893817901611,13.61424732208252,6.079723834991455,14.26726245880127,6.732738018035889)
                curveTo(14.920276641845703,7.385752201080322,15.160106658935547,8.345576286315918,14.890999794006348,9.229000091552734)
            }
            lucidePath(strokeWidth) {
                moveTo(17.851999282836914,12.1850004196167)
                curveTo(19.625,9.603632926940918,19.305326461791992,6.125018119812012,17.091554641723633,3.910022497177124)
                curveTo(14.877784729003906,1.6950268745422363,11.399347305297852,1.3734287023544312,8.816999435424805,3.145000457763672)
            }
            lucidePath(strokeWidth) {
                moveTo(18.01300048828125,18.01300048828125)
                curveTo(15.029000282287598,20.349000930786133,10.831000328063965,22.0,7.0,22.0)
                curveTo(5.864500999450684,21.99844741821289,4.827188968658447,21.355934143066406,4.319999694824219,20.34000015258789)
                lineTo(2.4000000953674316,16.5)
            }
            lucidePath(strokeWidth) {
                moveTo(18.5,6.0)
                lineTo(20.690000534057617,10.5)
                curveTo(21.1568546295166,11.935811042785645,21.107690811157227,13.489574432373047,20.551000595092773,14.892999649047852)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.355000019073486,6.369999885559082)
                curveTo(6.328677177429199,6.446228981018066,6.303673267364502,6.52290678024292,6.28000020980835,6.599999904632568)
                curveTo(5.180000305175781,9.729999542236328,5.5,10.5,3.1000001430511475,12.680000305175781)
                curveTo(2.120103359222412,13.483345985412598,1.750598430633545,14.81572151184082,2.1767728328704834,16.009010314941406)
                curveTo(2.602947473526001,17.202299118041992,3.7328925132751465,17.999155044555664,5.0,18.0)
                curveTo(8.355999946594238,18.0,11.993000030517578,16.732999801635742,14.850000381469727,14.848999977111816)
            }
}

public val LucideIcons.All.BeefOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BeefOff: ImageVector
    @Composable get() = BeefOffDefinition.asImageVector()
