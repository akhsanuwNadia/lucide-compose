package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ear") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,8.5f)
                curveTo(5.9895835f,6.170849f,7.2261934f,4.0141535f,9.24158f,2.8465607f)
                curveTo(11.256966f,1.6789678f,13.743034f,1.6789678f,15.75842f,2.8465607f)
                curveTo(17.773806f,4.0141535f,19.010416f,6.170849f,19.0f,8.5f)
                curveTo(19.0f,14.5f,13.0f,14.5f,13.0f,18.5f)
                curveTo(13.005609f,19.754158f,12.339742f,20.915455f,11.254534f,21.544159f)
                curveTo(10.169326f,22.172863f,8.830674f,22.172863f,7.7454658f,21.544159f)
                curveTo(6.6602583f,20.915455f,5.9943914f,19.754158f,6.0f,18.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,8.5f)
                curveTo(14.993845f,7.1236525f,13.876362f,6.0111556f,12.5f,6.0111556f)
                curveTo(11.123638f,6.0111556f,10.006155f,7.1236525f,10.0f,8.5f)
                lineTo(10.0f,9.5f)
                curveTo(10.716661f,9.496795f,11.38026f,9.877291f,11.73952f,10.497409f)
                curveTo(12.098779f,11.117528f,12.098779f,11.882472f,11.73952f,12.502591f)
                curveTo(11.38026f,13.122709f,10.716661f,13.503205f,10.0f,13.5f)
            }
}

public val LucideIcons.All.EarDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ear: ImageVector
    @Composable get() = EarDefinition.asImageVector()
