package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Moon") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.985f,12.486f)
                curveTo(20.72386f,17.323496f,16.68038f,21.086329f,11.83662f,20.999414f)
                curveTo(6.992861f,20.912502f,3.086976f,17.007029f,2.999551f,12.163279f)
                curveTo(2.912126f,7.319528f,6.674533f,3.2756505f,11.512001f,3.014f)
                curveTo(11.917001f,2.9919999f,12.129001f,3.474f,11.914001f,3.817f)
                curveTo(10.433188f,6.1862564f,10.7837f,9.264052f,12.759324f,11.239676f)
                curveTo(14.734948f,13.215301f,17.812744f,13.565812f,20.182001f,12.084999f)
                curveTo(20.526001f,11.869999f,21.007002f,12.080999f,20.985f,12.485999f)
            }
}

public val LucideIcons.All.MoonDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Moon: ImageVector
    @Composable get() = MoonDefinition.asImageVector()
