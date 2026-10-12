package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BellElectric") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.518f,17.347f)
                curveTo(17.254585f,18.414463f,15.653994f,19.00007f,14.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.8f,4.0f)
                curveTo(19.589397f,5.5484576f,20.000631f,7.261935f,20.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,9.0f)
                lineTo(9.01f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,16.0f)
                curveTo(17.996796f,16.716661f,18.37729f,17.38026f,18.99741f,17.73952f)
                curveTo(19.617527f,18.09878f,20.382473f,18.09878f,21.00259f,17.73952f)
                curveTo(21.62271f,17.38026f,22.003204f,16.716661f,22.0f,16.0f)
                curveTo(22.003204f,15.283339f,21.62271f,14.61974f,21.00259f,14.26048f)
                curveTo(20.382473f,13.901221f,19.617527f,13.901221f,18.99741f,14.26048f)
                curveTo(18.37729f,14.61974f,17.996796f,15.283339f,18.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,9.0f)
                curveTo(1.9887824f,11.508317f,3.320516f,13.830912f,5.490932f,15.088319f)
                curveTo(7.6613474f,16.345726f,10.338653f,16.345726f,12.5090685f,15.088319f)
                curveTo(14.679483f,13.830912f,16.011217f,11.508317f,16.0f,9.0f)
                curveTo(16.011217f,6.4916835f,14.679483f,4.1690884f,12.5090685f,2.9116807f)
                curveTo(10.338653f,1.654273f,7.6613474f,1.654273f,5.490932f,2.9116807f)
                curveTo(3.320516f,4.1690884f,1.9887824f,6.4916835f,2.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,16.0f)
                lineTo(12.0f,16.0f)
                lineTo(14.0f,16.0f)
                lineTo(14.0f,22.0f)
                lineTo(12.0f,22.0f)
                lineTo(6.0f,22.0f)
                lineTo(4.0f,22.0f)
                lineTo(4.0f,16.0f)
                lineTo(6.0f,16.0f)
                close()
            }
}

public val LucideIcons.All.BellElectricDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BellElectric: ImageVector
    @Composable get() = BellElectricDefinition.asImageVector()
