package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShipWheel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,12.0f)
                curveTo(3.98718f,14.866648f,5.5091615f,17.521042f,7.9896364f,18.958078f)
                curveTo(10.470112f,20.395117f,13.529888f,20.395117f,16.010363f,18.958078f)
                curveTo(18.490839f,17.521042f,20.01282f,14.866648f,20.0f,12.0f)
                curveTo(20.01282f,9.133352f,18.490839f,6.478958f,16.010363f,5.0419207f)
                curveTo(13.529888f,3.6048834f,10.470112f,3.6048834f,7.9896364f,5.0419207f)
                curveTo(5.5091615f,6.478958f,3.98718f,9.133352f,4.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,9.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,5.0f)
                lineTo(13.77f,10.23f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,12.0f)
                lineTo(14.5f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,19.0f)
                lineTo(13.77f,13.77f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,14.5f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.23f,13.77f)
                lineTo(5.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5f,12.0f)
                lineTo(2.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.23f,10.23f)
                lineTo(5.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5f,12.0f)
                curveTo(9.495994f,12.895827f,9.971613f,13.725326f,10.746761f,14.174399f)
                curveTo(11.52191f,14.623474f,12.47809f,14.623474f,13.253239f,14.174399f)
                curveTo(14.028387f,13.725326f,14.504006f,12.895827f,14.5f,12.0f)
                curveTo(14.504006f,11.104173f,14.028387f,10.274674f,13.253239f,9.825601f)
                curveTo(12.47809f,9.376526f,11.52191f,9.376526f,10.746761f,9.825601f)
                curveTo(9.971613f,10.274674f,9.495994f,11.104173f,9.5f,12.0f)
            }
}

public val LucideIcons.All.ShipWheelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShipWheel: ImageVector
    @Composable get() = ShipWheelDefinition.asImageVector()
