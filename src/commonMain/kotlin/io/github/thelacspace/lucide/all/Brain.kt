package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Brain") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,18.0f)
                lineTo(12.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,13.0f)
                curveTo(13.222888f,12.480519f,12.00111f,10.851481f,12.0f,9.0f)
                curveTo(11.99889f,10.851481f,10.777112f,12.480519f,9.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.598f,6.5f)
                curveTo(18.22867f,5.407775f,18.108854f,4.0377226f,17.29817f,3.071549f)
                curveTo(16.487486f,2.1053748f,15.159068f,1.7494214f,13.973905f,2.180802f)
                curveTo(12.788741f,2.612183f,11.999944f,3.73877f,12.0f,5.0f)
                curveTo(12.000055f,3.73877f,11.211259f,2.6121836f,10.026095f,2.180803f)
                curveTo(8.840932f,1.7494222f,7.512514f,2.1053758f,6.7018294f,3.0715494f)
                curveTo(5.891145f,4.037723f,5.7713294f,5.407775f,6.402f,6.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.997f,5.125f)
                curveTo(19.18802f,5.4312396f,20.171978f,6.2683105f,20.665155f,7.394849f)
                curveTo(21.158333f,8.521387f,21.10591f,9.812167f,20.522999f,10.895f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,18.0f)
                curveTo(19.810352f,17.999922f,21.394966f,16.783955f,21.863525f,15.035289f)
                curveTo(22.332085f,13.286624f,21.567766f,11.441255f,20.0f,10.535999f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.967f,17.483f)
                curveTo(20.15799f,18.960669f,19.511852f,20.422024f,18.290308f,21.27514f)
                curveTo(17.068762f,22.128258f,15.474289f,22.231728f,14.152731f,21.54364f)
                curveTo(12.831173f,20.85555f,12.001588f,19.48996f,12.0f,18.0f)
                curveTo(11.998409f,19.489958f,11.168824f,20.855547f,9.847267f,21.543633f)
                curveTo(8.52571f,22.23172f,6.931239f,22.12825f,5.709695f,21.275135f)
                curveTo(4.488151f,20.42202f,3.8420131f,18.960667f,4.033f,17.483f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,18.0f)
                curveTo(4.189647f,17.999922f,2.6050346f,16.783955f,2.1364748f,15.035289f)
                curveTo(1.6679153f,13.286624f,2.4322343f,11.441255f,4.0f,10.535999f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.003f,5.125f)
                curveTo(4.811979f,5.4312396f,3.8280208f,6.26831f,3.3348432f,7.3948483f)
                curveTo(2.8416653f,8.521387f,2.8940895f,9.812166f,3.4769998f,10.895f)
            }
}

public val LucideIcons.All.BrainDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Brain: ImageVector
    @Composable get() = BrainDefinition.asImageVector()
