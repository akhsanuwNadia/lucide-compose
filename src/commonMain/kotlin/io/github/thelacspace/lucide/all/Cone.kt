package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.899999618530273,18.549999237060547)
                lineTo(12.899999618530273,2.5699996948242188)
                curveTo(12.73291301727295,2.2250092029571533,12.383321762084961,2.005889415740967,12.0,2.005889415740967)
                curveTo(11.616677284240723,2.005889415740967,11.267086029052734,2.2250092029571533,11.09999942779541,2.5699996948242188)
                lineTo(3.09999942779541,18.549999237060547)
            }
}

public val LucideIcons.All.ConeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cone: ImageVector
    @Composable get() = ConeDefinition.asImageVector()
