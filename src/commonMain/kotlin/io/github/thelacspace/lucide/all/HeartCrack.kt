package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HeartCrack") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.409f,5.824f)
                curveTo(11.707001f,6.6159997f,11.259001f,7.3199997f,10.994f,7.99f)
                lineTo(13.147f,10.146f)
                curveTo(13.342191f,10.341249f,13.342191f,10.65775f,13.147f,10.853f)
                lineTo(10.854f,13.146f)
                curveTo(10.65881f,13.341249f,10.65881f,13.65775f,10.854f,13.853f)
                lineTo(12.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.508f,20.313f)
                curveTo(13.131067f,20.745916f,12.586294f,20.99601f,12.012289f,20.999643f)
                curveTo(11.438283f,21.003279f,10.890386f,20.760107f,10.508f,20.331999f)
                lineTo(5.0f,15.0f)
                curveTo(3.5f,13.5f,2.0f,11.8f,2.0f,9.5f)
                curveTo(1.9996277f,7.221763f,3.4038804f,5.179128f,5.5311418f,4.3635783f)
                curveTo(7.658403f,3.5480282f,10.068267f,4.128406f,11.591f,5.823f)
                curveTo(11.821152f,6.0379515f,12.178323f,6.0383883f,12.408999f,5.824f)
                curveTo(13.93161f,4.1295414f,16.341227f,3.5491068f,18.468391f,4.364398f)
                curveTo(20.595556f,5.1796894f,21.999958f,7.221946f,22.0f,9.5f)
                curveTo(22.0f,11.79f,20.5f,13.5f,19.0f,15.0f)
                close()
            }
}

public val LucideIcons.All.HeartCrackDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HeartCrack: ImageVector
    @Composable get() = HeartCrackDefinition.asImageVector()
