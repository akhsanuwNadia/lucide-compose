package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LockOpen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,11.0f)
                lineTo(19.0f,11.0f)
                curveTo(20.10457f,11.0f,21.0f,11.895431f,21.0f,13.0f)
                lineTo(21.0f,20.0f)
                curveTo(21.0f,21.10457f,20.10457f,22.0f,19.0f,22.0f)
                lineTo(5.0f,22.0f)
                curveTo(3.8954306f,22.0f,3.0f,21.10457f,3.0f,20.0f)
                lineTo(3.0f,13.0f)
                curveTo(3.0f,11.895431f,3.8954306f,11.0f,5.0f,11.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,11.0f)
                lineTo(7.0f,7.0f)
                curveTo(6.9974194f,4.4312353f,8.941743f,2.2784486f,11.497504f,2.0202909f)
                curveTo(14.053265f,1.7621332f,16.388826f,3.482608f,16.9f,6.0f)
            }
}

public val LucideIcons.All.LockOpenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LockOpen: ImageVector
    @Composable get() = LockOpenDefinition.asImageVector()
