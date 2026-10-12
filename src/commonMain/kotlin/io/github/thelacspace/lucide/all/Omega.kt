package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Omega") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,20.0f)
                lineTo(7.5f,20.0f)
                curveTo(7.7761426f,20.0f,8.0f,19.776142f,8.0f,19.5f)
                lineTo(8.0f,19.218f)
                curveTo(7.9980817f,19.039608f,7.9048457f,18.874651f,7.753f,18.781f)
                curveTo(4.7296295f,16.88754f,3.3252697f,13.221085f,4.310093f,9.792371f)
                curveTo(5.2949157f,6.363657f,8.430916f,4.0013194f,11.9982605f,4.0008993f)
                curveTo(15.565606f,4.0004797f,18.702162f,6.3620796f,19.687792f,9.790562f)
                curveTo(20.673422f,13.219043f,19.269924f,16.88583f,16.247f,18.78f)
                curveTo(16.094856f,18.87384f,16.001575f,19.039251f,16.0f,19.218f)
                lineTo(16.0f,19.5f)
                curveTo(16.0f,19.776142f,16.223858f,20.0f,16.5f,20.0f)
                lineTo(21.0f,20.0f)
            }
}

public val LucideIcons.All.OmegaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Omega: ImageVector
    @Composable get() = OmegaDefinition.asImageVector()
