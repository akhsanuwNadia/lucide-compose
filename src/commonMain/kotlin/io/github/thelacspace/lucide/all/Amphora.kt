package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Amphora") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,2.0)
                lineTo(10.0,7.631999969482422)
                curveTo(10.0,8.055999755859375,9.727999687194824,8.427000045776367,9.347000122070312,8.61400032043457)
                curveTo(7.296248912811279,9.624971389770508,5.9983229637146,11.713597297668457,6.0,14.0)
                curveTo(6.00600004196167,18.0,9.0,21.0,11.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,5.0)
                lineTo(8.0,5.0)
                curveTo(6.898921966552734,5.004924297332764,6.00892448425293,5.898910999298096,6.00892448425293,7.0)
                curveTo(6.00892448425293,8.101089477539062,6.898921966552734,8.995076179504395,8.0,9.0)
                lineTo(8.680000305175781,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,7.631999969482422)
                curveTo(14.0,8.055999755859375,14.272000312805176,8.427000045776367,14.652000427246094,8.61400032043457)
                curveTo(16.703140258789062,9.624689102172852,18.001489639282227,11.713372230529785,18.0,14.0)
                curveTo(18.0,18.0,15.0,21.0,13.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,5.0)
                lineTo(16.0,5.0)
                curveTo(17.101078033447266,5.004924297332764,17.99107551574707,5.898910999298096,17.99107551574707,7.0)
                curveTo(17.99107551574707,8.101089477539062,17.101078033447266,8.995076179504395,16.0,9.0)
                lineTo(15.319999694824219,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,22.0)
                lineTo(6.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,2.0)
                lineTo(15.0,2.0)
            }
}

public val LucideIcons.All.AmphoraDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Amphora: ImageVector
    @Composable get() = AmphoraDefinition.asImageVector()
