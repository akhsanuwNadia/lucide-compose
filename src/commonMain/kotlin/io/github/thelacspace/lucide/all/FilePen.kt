package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FilePen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.659000396728516,22.0)
                lineTo(18.0,22.0)
                curveTo(19.104570388793945,22.0,20.0,21.104570388793945,20.0,20.0)
                lineTo(20.0,8.0)
                curveTo(20.001569747924805,7.359942436218262,19.747406005859375,6.745773792266846,19.29400062561035,6.294000148773193)
                lineTo(15.706000328063965,2.7060000896453857)
                curveTo(15.254226684570312,2.252593755722046,14.640057563781738,1.9984302520751953,14.0,2.0)
                lineTo(6.0,2.0)
                curveTo(4.895430564880371,2.0,4.0,2.895430564880371,4.0,4.0)
                lineTo(4.0,13.34000015258789)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,7.0)
                curveTo(14.0,7.5522847175598145,14.447714805603027,8.0,15.0,8.0)
                lineTo(20.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.378000259399414,12.621999740600586)
                curveTo(11.208328247070312,11.799887657165527,12.54698371887207,11.803550720214844,13.372800827026367,12.630192756652832)
                curveTo(14.198616981506348,13.456835746765137,14.200942039489746,14.795494079589844,13.378000259399414,15.625)
                lineTo(8.359999656677246,20.636999130249023)
                curveTo(8.1223783493042,20.874752044677734,7.828664779663086,21.048778533935547,7.505999565124512,21.14299964904785)
                lineTo(4.6389994621276855,21.979999542236328)
                curveTo(4.463734149932861,22.031118392944336,4.274540424346924,21.982646942138672,4.145445823669434,21.853551864624023)
                curveTo(4.016350746154785,21.724456787109375,3.9678802490234375,21.535263061523438,4.0189995765686035,21.35999870300293)
                lineTo(4.854999542236328,18.490999221801758)
                curveTo(4.949373245239258,18.168691635131836,5.123390197753906,17.87533950805664,5.360999584197998,17.637998580932617)
                close()
            }
}

public val LucideIcons.All.FilePenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FilePen: ImageVector
    @Composable get() = FilePenDefinition.asImageVector()
