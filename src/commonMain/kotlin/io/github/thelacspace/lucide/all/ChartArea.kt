package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartArea") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,3.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(21.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,11.207f)
                curveTo(7.000028f,11.074648f,7.0525312f,10.947705f,7.146f,10.854f)
                lineTo(9.146f,8.854f)
                curveTo(9.239804f,8.759958f,9.367172f,8.707107f,9.5f,8.707107f)
                curveTo(9.632828f,8.707107f,9.760196f,8.759958f,9.854f,8.854f)
                lineTo(13.146f,12.146f)
                curveTo(13.239804f,12.240042f,13.367172f,12.292893f,13.5f,12.292893f)
                curveTo(13.632828f,12.292893f,13.760196f,12.240042f,13.854f,12.146f)
                lineTo(18.146f,7.854f)
                curveTo(18.288885f,7.7107525f,18.504017f,7.667736f,18.691f,7.745025f)
                curveTo(18.877983f,7.8223143f,18.999956f,8.004673f,19.0f,8.207f)
                lineTo(19.0f,16.0f)
                curveTo(19.0f,16.552284f,18.552284f,17.0f,18.0f,17.0f)
                lineTo(8.0f,17.0f)
                curveTo(7.4477153f,17.0f,7.0f,16.552284f,7.0f,16.0f)
                close()
            }
}

public val LucideIcons.All.ChartAreaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartArea: ImageVector
    @Composable get() = ChartAreaDefinition.asImageVector()
