package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RectangleCircle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,4.0f)
                lineTo(14.0f,20.0f)
                lineTo(3.0f,20.0f)
                curveTo(2.4477153f,20.0f,2.0f,19.552284f,2.0f,19.0f)
                lineTo(2.0f,5.0f)
                curveTo(2.0f,4.4477153f,2.4477153f,4.0f,3.0f,4.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,12.0f)
                curveTo(5.9871798f,14.866648f,7.5091615f,17.521042f,9.989636f,18.958078f)
                curveTo(12.470112f,20.395117f,15.529888f,20.395117f,18.010363f,18.958078f)
                curveTo(20.490839f,17.521042f,22.01282f,14.866648f,22.0f,12.0f)
                curveTo(22.01282f,9.133352f,20.490839f,6.478958f,18.010363f,5.0419207f)
                curveTo(15.529888f,3.6048834f,12.470112f,3.6048834f,9.989636f,5.0419207f)
                curveTo(7.5091615f,6.478958f,5.9871798f,9.133352f,6.0f,12.0f)
            }
}

public val LucideIcons.All.RectangleCircleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RectangleCircle: ImageVector
    @Composable get() = RectangleCircleDefinition.asImageVector()
