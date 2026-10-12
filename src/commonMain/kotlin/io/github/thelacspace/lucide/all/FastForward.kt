package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FastForward") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                curveTo(12.000173f,5.1912084f,12.487455f,4.4621325f,13.234691f,4.1526446f)
                curveTo(13.981927f,3.8431566f,14.842011f,4.0141845f,15.414f,4.586f)
                lineTo(21.414f,10.586f)
                curveTo(22.194763f,11.367001f,22.194763f,12.633f,21.414f,13.4140005f)
                lineTo(15.414f,19.414001f)
                curveTo(14.8420105f,19.985817f,13.981926f,20.156845f,13.23469f,19.847357f)
                curveTo(12.487454f,19.537868f,12.000173f,18.808792f,12.0f,18.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,6.0f)
                curveTo(2.0001726f,5.1912084f,2.487455f,4.462132f,3.234691f,4.152644f)
                curveTo(3.9819267f,3.843156f,4.8420115f,4.014184f,5.414f,4.586f)
                lineTo(11.414f,10.586f)
                curveTo(12.194763f,11.367001f,12.194763f,12.633f,11.414f,13.4140005f)
                lineTo(5.4139996f,19.414001f)
                curveTo(4.842011f,19.985817f,3.981926f,20.156845f,3.2346902f,19.847357f)
                curveTo(2.4874544f,19.537868f,2.0001724f,18.808792f,2.0f,18.0f)
                close()
            }
}

public val LucideIcons.All.FastForwardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FastForward: ImageVector
    @Composable get() = FastForwardDefinition.asImageVector()
