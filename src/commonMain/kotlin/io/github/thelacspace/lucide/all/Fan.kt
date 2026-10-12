package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Fan") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.827f,16.379f)
                curveTo(8.686441f,17.460718f,6.1100516f,17.183474f,4.248642f,15.671105f)
                curveTo(2.3872323f,14.158737f,1.588414f,11.693674f,2.2089996f,9.377f)
                lineTo(7.621f,10.827f)
                curveTo(6.539282f,8.686441f,6.816526f,6.110052f,8.328895f,4.2486424f)
                curveTo(9.841263f,2.3872328f,12.306325f,1.5884142f,14.622999f,2.2089996f)
                lineTo(13.172999f,7.621f)
                curveTo(15.313558f,6.5392814f,17.889948f,6.816525f,19.751358f,8.328894f)
                curveTo(21.612768f,9.841262f,22.411587f,12.306325f,21.791f,14.622999f)
                lineTo(16.379f,13.172999f)
                curveTo(17.460718f,15.313558f,17.183474f,17.889948f,15.671106f,19.751358f)
                curveTo(14.158737f,21.612768f,11.693674f,22.411587f,9.377f,21.791f)
                lineTo(10.827f,16.379f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(12.0f,12.01f)
            }
}

public val LucideIcons.All.FanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Fan: ImageVector
    @Composable get() = FanDefinition.asImageVector()
