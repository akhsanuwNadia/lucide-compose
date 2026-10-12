package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ConciergeBell") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,20.0f)
                curveTo(2.4477153f,20.0f,2.0f,19.552284f,2.0f,19.0f)
                lineTo(2.0f,18.0f)
                curveTo(2.0f,16.89543f,2.8954306f,16.0f,4.0f,16.0f)
                lineTo(20.0f,16.0f)
                curveTo(21.10457f,16.0f,22.0f,16.89543f,22.0f,18.0f)
                lineTo(22.0f,19.0f)
                curveTo(22.0f,19.552284f,21.552284f,20.0f,21.0f,20.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,16.0f)
                curveTo(20.01282f,13.133352f,18.490839f,10.478958f,16.010363f,9.041921f)
                curveTo(13.529888f,7.6048837f,10.470112f,7.6048837f,7.9896364f,9.041921f)
                curveTo(5.5091615f,10.478958f,3.98718f,13.133352f,4.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,4.0f)
                lineTo(12.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,4.0f)
                lineTo(14.0f,4.0f)
            }
}

public val LucideIcons.All.ConciergeBellDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ConciergeBell: ImageVector
    @Composable get() = ConciergeBellDefinition.asImageVector()
