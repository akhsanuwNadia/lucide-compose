package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Rewind") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                curveTo(11.999827f,5.1912084f,11.512545f,4.4621325f,10.765309f,4.1526446f)
                curveTo(10.018073f,3.8431566f,9.157989f,4.0141845f,8.586f,4.586f)
                lineTo(2.5860004f,10.586f)
                curveTo(1.8052366f,11.367001f,1.8052366f,12.633f,2.5860004f,13.4140005f)
                lineTo(8.586f,19.414001f)
                curveTo(9.1579895f,19.985817f,10.018074f,20.156845f,10.76531f,19.847357f)
                curveTo(11.512546f,19.537868f,11.999827f,18.808792f,12.0f,18.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,6.0f)
                curveTo(21.999826f,5.1912084f,21.512545f,4.4621325f,20.765308f,4.1526446f)
                curveTo(20.018074f,3.8431566f,19.15799f,4.0141845f,18.586f,4.586f)
                lineTo(12.586f,10.586f)
                curveTo(11.805237f,11.367001f,11.805237f,12.633f,12.586f,13.4140005f)
                lineTo(18.586f,19.414001f)
                curveTo(19.15799f,19.985817f,20.018074f,20.156845f,20.76531f,19.847357f)
                curveTo(21.512547f,19.537868f,21.999828f,18.808792f,22.0f,18.0f)
                close()
            }
}

public val LucideIcons.All.RewindDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Rewind: ImageVector
    @Composable get() = RewindDefinition.asImageVector()
