package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareStack") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,10.0)
                curveTo(2.9000000953674316,10.0,2.0,9.100000381469727,2.0,8.0)
                lineTo(2.0,4.0)
                curveTo(2.0,2.9000000953674316,2.9000000953674316,2.0,4.0,2.0)
                lineTo(8.0,2.0)
                curveTo(9.100000381469727,2.0,10.0,2.9000000953674316,10.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,16.0)
                curveTo(8.899999618530273,16.0,8.0,15.100000381469727,8.0,14.0)
                lineTo(8.0,10.0)
                curveTo(8.0,8.899999618530273,8.899999618530273,8.0,10.0,8.0)
                lineTo(14.0,8.0)
                curveTo(15.100000381469727,8.0,16.0,8.899999618530273,16.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,14.0)
                lineTo(20.0,14.0)
                lineTo(22.0,14.0)
                lineTo(22.0,22.0)
                lineTo(20.0,22.0)
                lineTo(16.0,22.0)
                lineTo(14.0,22.0)
                lineTo(14.0,14.0)
                lineTo(16.0,14.0)
                close()
            }
}

public val LucideIcons.All.SquareStackDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareStack: ImageVector
    @Composable get() = SquareStackDefinition.asImageVector()
