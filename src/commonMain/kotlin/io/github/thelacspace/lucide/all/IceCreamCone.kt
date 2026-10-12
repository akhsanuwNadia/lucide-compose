package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("IceCreamCone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,11.0)
                lineTo(11.079999923706055,21.350000381469727)
                curveTo(11.237088203430176,21.718753814697266,11.599181175231934,21.95808219909668,12.0,21.95808219909668)
                curveTo(12.400818824768066,21.95808219909668,12.762911796569824,21.718753814697266,12.920000076293945,21.350000381469727)
                lineTo(17.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,7.0)
                curveTo(16.987689971923828,4.247304439544678,14.75272274017334,2.022310733795166,12.0,2.022310733795166)
                curveTo(9.24727725982666,2.022310733795166,7.01231050491333,4.247304439544678,7.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,7.0)
                curveTo(18.101078033447266,7.004924297332764,18.99107551574707,7.898910999298096,18.99107551574707,9.0)
                curveTo(18.99107551574707,10.101089477539062,18.101078033447266,10.995076179504395,17.0,11.0)
                lineTo(7.0,11.0)
                curveTo(5.898921966552734,10.995076179504395,5.00892448425293,10.101089477539062,5.00892448425293,9.0)
                curveTo(5.00892448425293,7.898910999298096,5.898921966552734,7.004924297332764,7.0,7.0)
            }
}

public val LucideIcons.All.IceCreamConeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.IceCreamCone: ImageVector
    @Composable get() = IceCreamConeDefinition.asImageVector()
